def solution(arr):
    result = []
    for i in range(0,len(arr)):
        if(i==len(arr)-1):
            result.append(arr[len(arr)-1])
            return result
        if(arr[i]!=arr[i+1]):
            result.append(arr[i])
            
    
    return result


