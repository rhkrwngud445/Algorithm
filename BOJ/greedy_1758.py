#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Aug  5 17:39:48 2021

@author: kwakjoohyeong
"""

num = int(input())
sum =0
array = list(0 for i in range(num))
for i in range(0,num):
    array[i] = int(input())
array.sort(reverse=True)
for i in range(0,num):
    if(int(array[i])-i>=0):
        array[i] = int(array[i])-i
        sum = int(sum)+ array[i]  
print(sum)
