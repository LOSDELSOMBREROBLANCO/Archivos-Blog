from tkinter import Tk,Text,Button,Label,Entry,END
import Funciones as fun

class Interfaz:
    def __init__(self,ventana):
        # Configuración de la ventana
        self.window=ventana
        self.window.title('LOS DEL SOMBRERO BLANCO')

        #Componentes
        self.mensaje='\t\t\tEvaluación de funciones cuadráticas\nIngrese los valores en el orden puesto a continuacion para una evaluación correcta de la función.\nLas ecuaciones que se pueden evaluar son del tipo ax^2 + bx + c.'
        self.lbl_bienvenida=Label(self.window,width=80,height=4,text=self.mensaje,anchor='w',justify='left')
        self.lbl_bienvenida.grid(row=0,column=0,columnspan=3,padx=4,pady=4,)

        self.lbl_a=Label(self.window,padx=4,pady=4,height=1,text='Ingrese a:')
        self.lbl_a.grid(row=1,column=0)
        
        self.lbl_b=Label(self.window,padx=4,pady=4,height=1,text='Ingrese b:')
        self.lbl_b.grid(row=2,column=0)

        self.lbl_c=Label(self.window,padx=4,pady=4,height=1,text='Ingrese c:')
        self.lbl_c.grid(row=3,column=0)

        self.txt_a=Entry(self.window,width=30)
        self.txt_a.grid(row=1,column=1,padx=4,pady=4)
        self.txt_a.focus()

        self.txt_b=Entry(self.window,width=30)
        self.txt_b.grid(row=2,column=1,padx=4,pady=4)

        self.txt_c=Entry(self.window,width=30)
        self.txt_c.grid(row=3,column=1,padx=4,pady=4)

        self.btn_calcular=Button(self.window,text='calcular',cursor='hand2',width=6,height=1,command=self.cargar_respuesta)
        self.btn_calcular.grid(row=4,column=2,padx=4,pady=4)

        self.txt_respuesta=Text(self.window,state='disabled',width=50,height=2)
        self.txt_respuesta.grid(row=5,column=1,columnspan=2,padx=4,pady=10)

    def cargar_respuesta(self):
        var_a=self.txt_a.get()
        var_b=self.txt_b.get()
        var_c=self.txt_c.get()
        mensaje=""
        if var_a!="" and var_b!="" and var_c!="":
            try:
                num=[int(var_a),int(var_b),int(var_c)]
                self.txt_respuesta.configure(height=7)
                respuestas=fun.calculo_Respuestas_Fun_Cua(num[0],num[1],num[2])
                ecuacion="{0}x^2+{1}x+{2}"
                mensaje="Los datos ingresados fueron: \na:"+str(num[0])+"\nb:"+str(num[1])+"\nc:"+str(num[1])+"\nLas raíces de la ecuación "+ecuacion.format(num[0],num[1],num[2])+" son:\nRespuesta 1: "+str(respuestas[0])+"\nRespuesta 2: "+str(respuestas[1])
            except ValueError:
                self.txt_respuesta.configure(height=2)
                mensaje='Los datos ingresados no cumplen con el formato solicitado'
        else:
            self.txt_respuesta.configure(height=1)
            mensaje='No ha ingresado todos los valores solicitados'
        self.txt_a.delete(0,END)
        self.txt_b.delete(0,END)
        self.txt_c.delete(0,END)
        self.txt_a.focus()
        self.txt_respuesta.configure(state='normal')
        self.txt_respuesta.delete('1.0',END)
        self.txt_respuesta.insert(END,mensaje)
        self.txt_respuesta.configure(state='disabled')

ventana=Tk()
vista=Interfaz(ventana)
ventana.mainloop()