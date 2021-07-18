#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Jul 18 17:48:14 2021

@author: kwakjoohyeong
"""

numOfTree = int(input())
day =1 
l = list(map(int, input().split()))

l.sort(reverse=True)
for i in range(1,numOfTree):
    l[i]=l[i]+i

print(max(l)+2)