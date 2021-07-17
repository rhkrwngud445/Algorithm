#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Jul 16 19:53:19 2021

@author: kwakjoohyeong
"""

a = int(input())
a300 = a/300
a60 = a/60
a10 = a/10
ans1= 0
ans2 =0
ans3 = 0
if a%10 !=0:
    print("-1")
else :
    if  a300>=1:
        ans1=int(a/300)
        a= a-(ans1*300)
        if( a60>=1 ):
            ans2 = int(a/60)
            a= a-(ans2*60)
            if(a%10 == 0 and a10>=1):
                ans3 = int(a/10)
    elif a60>=1:
        ans2=int(a/60)
        a= a-(ans2*60)
        if(a%10 == 0 and a10>=1):
                ans3 = int(a/10)
    elif(a%10 == 0 and a10>=1):
                ans3 = int(a/10)
    print(int(ans1),int(ans2),int(ans3))
    
                
            
    
        