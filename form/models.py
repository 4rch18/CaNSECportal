# -*- coding: utf-8 -*-
from __future__ import unicode_literals
from django.db import models

# Create your models here.

class Indicator(models.Model):
    indicator_text = models.CharField(max_length=200)

    def __str__(self):
        return self.indicator_text

class SubIndicator(models.Model):
    indicator = models.ForeignKey(Indicator, on_delete=models.CASCADE)
    subindicator_text = models.CharField(max_length=200)
    explanation_text = models.TextField()

    BINARY = 'B'
    DECIMAL = 'D'
    MCHOICE = 'M'
    NONE = 'N'

    DATATYPE_CHOICES = (
        (BINARY, 'Binary'),
        (DECIMAL, 'Decimal'),
        (NONE, 'None'),
        (MCHOICE, 'Multiple Choice')
    )

    datatype = models.CharField(
        max_length=1,
        choices=DATATYPE_CHOICES,
        default=NONE
    ) # To be able to choose any of the 3 possible data types

    # Idea No. 1: Use the datatype data (not to be asked from user) to differentiate between the restrictions on different kind of inputs
        # The input can always be in the same way, a number, just with different conditions

    def __str__(self):
        return '%s > %s | %s | %s' % (self.indicator.indicator_text, self.subindicator_text, self.datatype, self.explanation_text)