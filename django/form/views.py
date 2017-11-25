# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.shortcuts import render

from .models import Indicator, SubIndicator

# Create your views here.

def index(request):
    indicator_list = Indicator.objects.all()
    subindicator_list = SubIndicator.objects.all()
    context = {
        'indicator_list': indicator_list,
        'subindicator_list': subindicator_list,
    }

    return render(request, 'form/index.html', context)

def detail(request, indicator_id):
    try:
        indicator = Indicator.objects.get(pk=indicator_id)
    except Indicator.DoesNotExist:
        raise Http404("Question does not exist")
    return render(request, 'form/detail.html', {'indicator': indicator})