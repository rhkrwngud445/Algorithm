#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Jul 16 19:53:20 2021

@author: kwakjoohyeong
"""

num = int(input())
l = list(map(int, input().split()))
sum = 0
l.sort()

for i in range(0,num):
    for j in range(0,i+1):
        sum= sum +l[j]
    
print(sum)

