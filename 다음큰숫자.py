def solution(n):
    k = bin(n)[2:]
    while(True):
        n+=1
        q = bin(n)[2:]
        if(k.count('1')==q.count('1')):
            break
    return n
