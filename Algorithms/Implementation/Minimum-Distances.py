#!/bin/python

import sys

n = int(raw_input().strip())
A = map(int,raw_input().strip().split(' '))
minDist = 100000000
for i in range(n):
    for j in range(i+1,n):
        if A[i]==A[j]:
            dist = j-i
            if dist<minDist:
                minDist=dist
if minDist == 100000000:
    print '-1'
else:
    print minDist
