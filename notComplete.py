def solution(participant, completion):
    participant.sort()
    completion.sort()
    answer =""
    for x in range(0,len(completion)-1):
        if(participant[x] != completion[x]):
            return participant[x]

