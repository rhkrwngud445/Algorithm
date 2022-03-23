def solution(n):
    num = str(convert_notation(n,3))
    result = ''
    answer = 0
    for c in num: 
        result  = c + result
    return int(result,3)

def convert_notation(n, base):
    T = "0123456789ABCDEF"
    q, r = divmod(n, base)

    return convert_notation(q, base) + T[r] if q else T[r]
