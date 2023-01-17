// Databricks notebook source
println("Hello world!")

// COMMAND ----------

object HolaMundo {
  def main(): Unit = {
    println("Hello, world!")
  }
}

// COMMAND ----------

HolaMundo.main

// COMMAND ----------

// MAGIC %md
// MAGIC # Tipos de datos básicos

// COMMAND ----------

// MAGIC %md
// MAGIC 
// MAGIC Any: Es el valor top type
// MAGIC   - AnyVal: Boolean, Double, Float, Long, Int, Short, Byte (binario), Char, Unit (vacío)
// MAGIC   - AnyRef
// MAGIC Nothing: Tipo botton type (similar a None)

// COMMAND ----------

// MAGIC %md
// MAGIC # Variables, valores
// MAGIC 
// MAGIC - Las variables **var** son mutables
// MAGIC - Los valores **val** son inmutables
// MAGIC 
// MAGIC En lo posible evitar los datos mutables.

// COMMAND ----------

var x = 1
var y: Int = 0

// Podemos cambiar una variable ya instanciada
y = 12

println(s"Las variables : $x y $y")

// COMMAND ----------

// Los valores son inmutables
val my_string: String = "Hello world"

// COMMAND ----------

my_string = "Hola mundo"

// COMMAND ----------

// MAGIC %md
// MAGIC # Expresiones
// MAGIC 
// MAGIC Son los bloques de código. 
// MAGIC 
// MAGIC No es necesario un **return** para una expresión, por que siempre el valor final es el valor de retorno. 
// MAGIC 
// MAGIC **Unit** es un tipo de dato que nos ayuda a devolver "nada"

// COMMAND ----------

/* Todas son formas posibles de escribir
* el último valor escrito es que se devuelve
*/

// El paréntisis solo se usa si hay una expresión
def x = (3)

def y = 3

// Las llavees pueden recibir múltiples expresiones
def z = {3}

x

// COMMAND ----------

def my_function = { 1; 1 + 2 }

// COMMAND ----------

my_function

// COMMAND ----------

// MAGIC %md
// MAGIC # Funciones
// MAGIC 
// MAGIC Son

// COMMAND ----------



// COMMAND ----------

// MAGIC %md
// MAGIC #Condicionales

// COMMAND ----------

if (x != 3) "no es tres" else "es tres"

// COMMAND ----------

if (x != 3)
  "no es tres"
else
  "es tres"

// COMMAND ----------

// Si no ponemos `else` nos regresa Any
if (x != 3) "no es tres"

// COMMAND ----------


