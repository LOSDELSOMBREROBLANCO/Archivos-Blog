import math

def calculo_Discriminante(num_a ,num_b,num_c):
    return pow(num_b,2)-4*num_a*num_c

def signo_numero(num):
    if num>=0:
        return "+"+str(num)
    else:
        return str(num)

def calculo_Respuestas_Fun_Cua(num_a,num_b,num_c):
    respuestas=[]
    discriminante=calculo_Discriminante(num_a,num_b,num_c)
    if discriminante >= 0:
        respuestas.append(round(((-1)*num_b + math.sqrt(discriminante))/(2*num_a),3))
        respuestas.append(round(((-1)*num_b - math.sqrt(discriminante))/(2*num_a),3))
    else:
        respuestas.append(complex(str(round((-1)*num_b/(2*num_a),3))+ signo_numero(round(math.sqrt((-1)*discriminante)/(2*num_a),3))+"j"))
        respuestas.append(complex(str(round((-1)*num_b/(2*num_a),3))+ signo_numero(round((-1)*math.sqrt((-1)*discriminante)/(2*num_a),3))+"j"))
    return respuestas

