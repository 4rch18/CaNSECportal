# Import X from sub-indicator.txt
# Import V from program
'''
sampleV = [2, 1, 1, Y, 3,
           1, 1, Y, 1, 1,
           1, 1, 1, 1, 1,
           Y, Y, XY, 1, Y,
           Y, 2, 1, 1, 1,
           1, 1, 1, 1, 1,
           1, XY, XY, 1, 1,
           1, 1, Y, Y, Y,
           1, 4, 2]
'''

'''
sampleX = [190, 190, 360, 410, 350,
           420, 410, 390, 195, 39,
           39, 39, 78, 360, 390,
           300, 290, 280, 370, 360,
           300, 380, 90, 90, 90,
           90, 156, 156, 156, 156,
           156, 100, 100, 100, 50,
           50, 350, 304, 303, 303,
           340, 330, 390]
'''

''' FORMAT OF SUB-INDICATOR.TXT
<INDICATOR NO.> <SUBINDICATOR NO. IN INDICATOR> <SUB-INDICATOR NO., GLOBAL>
<SUBINDICATOR TEXT>
X <SCORE>
L <INPUTS/ LOWEST NUMBER OF AN INPUT RANGE (SEPARATED BY COMMA)>
<INPUT/ RANGE (INPUT=SINGLE NUMBER, RANGE=TWO NUMBERS SEPARATED BY COMMA)> <CORRESPONDING SCORE/ OUTPUT RANGE>
'''
f = open('sub-indicator.txt', 'r') # Read the file

# FORMAT OF subindicator.txt


f_dump = f.read()
a = f_dump.split('\n\n') # In array a, each element is sub-indicator data

subi = []
lev_total = 0

for line in a: # to get data out of a
    line_arr = line.split('\n')

    subi_num = int(line_arr[0].split(' ')[2])
    subi_text = line_arr[1]
    subi_X = int(line_arr[2].split(' ')[1])

    lev_temp = line_arr[3].split(' ')[1]\

    if type(lev_temp)==int:
        lev_total = 1
    else:
        lev_total = len(lev_temp.split(','))
    lev_info = []

    for i in range(4, 4+lev_total):
        lev_info.append(line_arr[i])

    subi.append([subi_num, subi_text, subi_X, lev_info])

for elem in subi:
    print elem
