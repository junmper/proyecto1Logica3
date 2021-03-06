
package modelo;

/**
 *
 * @author Yaqueline Hoyos Montes, Alejandro Marín Alzate
 */
public class Hilera extends ListaDoblementeLigada
{
    private int longitud;
    /**
     * Constructor de Hilera
     */
    public Hilera() 
    {
        super();
        longitud = 0;
    }
    /**
     * Devuelve la hilera en un vector char
     * @return 
     */
    public char[] hilera2Char()
    {
        char[] c = new char[this.longitud];
        NodoDoble p = this.primero;
        for (int i = 0; i < longitud; i++) {
            c[i] = (char) p.getDato();
            p = p.getLd();
        }
        
        return c;
    }
   
    /**
     * Se ingresa caracter a caracter
     * @param c
     * @param i 
     */
    public void insertarCartacter(char c,int i)
    {
        NodoDoble n = this.getNodoI(i);
        n.setDato(c);
    }
    
    /**
     * Inserta un solo caracter
     * @param c 
     */
    public void insertarCaracter(char c)
    {
        NodoDoble n = new NodoDoble(c);
        insertarAlFinal(n);
        longitud = longitud + 1;
    }

    /**
     * Retorna la longitud de la hilera
     * @return 
     */
    public int getLongitud() 
    {
        return longitud;
    }
    
    /**
     * Obtiene un nodo deseado
     * @param i
     * @return 
     */
    public NodoDoble getNodoI(int i)
    {
        NodoDoble p = this.primerNodo();
        for(int j = 1; j <= i; j++)
        {
            p = p.getLd();
        }
        return p;
    }
    
    /**
     * Modifica un vetor de char
     * @param c 
     */
    public void modificar(char[] c)
    {
       for(int i = 0; i < longitud; i++)
       {
            NodoDoble x = this.getNodoI(i);
            x.setDato(c);
       }
    }
    
    /**
     * Elimina el ultimo nodo
     */
    public void eliminarUltimo()
    {
        longitud--;
        this.desconectar(ultimo);
    }
    
    /**
     * Elimina un nodo deseado, ingresando como parametro el dato del nodo
     * @param x 
     */
    public void eliminarNodo(NodoDoble x)
    {
        longitud--;
        this.desconectar(x);
    }
    
    /**
     * Elimina un nodo deseado, ingresando como parámetro la dirección de memoria
     * @param x 
     */
    public void eliminarNodo(int x)
    {
        eliminarNodo(this.getNodoI(x));
    }
    
    /**
     * Metodo para invertir la hilera original
     */
    public void invertir()
    {
        int i = 0;
        Hilera h = new Hilera();
        NodoDoble p = this.ultimo;
        NodoDoble q = this.primero;
        while (i < longitud)
        {
            h.insertarCaracter((char)p.getDato());
            p = p.getLi();
            i++;
        }
        i = 0;
        p = h.primero;
        while (i < longitud)
        {
            q.setDato(p.getDato());
            p = p.getLd();
            q = q.getLd();
            i++;
        }
    }
    
    /**
     * Metodo que me ordena alfabéticamente la hilera original
     */
    public void ordenarAlfabeticamente()
    {
        int i = 0;
        ListaDoblementeLigada h = new ListaDoblementeLigada();
        NodoDoble p = this.primero;
        while(i < this.longitud)
        {
            NodoDoble pc = new NodoDoble(p.getDato());
            if (i == 0)
            {
                h.conectar(pc, null);
            }
            else
            {
                NodoDoble q = h.buscarDondeInsertar(pc.getDato());
                h.conectar(pc, q);
            }
            p = p.getLd();
            i++;
        }
        i = 0;
        p = h.primero;
        NodoDoble q = this.primero;
        while(i < this.longitud)
        {
            q.setDato(p.getDato());
            p = p.getLd();
            q = q.getLd();
            i++;
        }
    }
    
    /**
     * Éste método nos dice si una hilera nueva es substring de la hilera original
     * @param h1
     * @return 
     */
    public boolean esSubstring(Hilera h1)
    {
        boolean x = false;
        int i = 0;
        NodoDoble p = h1.primero;
        NodoDoble r = this.primero;
       /* if (this.longitud < h1.longitud)
        {
            while ((r != null) && (i < h1.longitud))
            {
                if (p.getDato() == r.getDato())
                {
                    p = p.getLd();
                    r = r.getLd();
                }
                else
                {
                    r = this.primero;
                    p = p.getLd();
                }
                i++;
            }
            if (r == null)
            {
                System.out.println("El this es subhilera de la nueva hilera");
                x = true;
            }
            else
            {
                System.out.println("No es subhilera");
            }
        }
        else if(this.longitud > h1.longitud)
        {*/
            while ((p != null) && (i < this.longitud))
            {
                if (p.getDato() == r.getDato())
                {
                    p = p.getLd();
                    r = r.getLd();
                }
                else
                {
                    p = h1.primero;
                    r = r.getLd();
                }
                i++;
            }
            if (p == null)
            {
                System.out.println("La nueva hilera es subhilera del this");
                x = true;
            }
            else
            {
                System.out.println("No es subhilera");
            }
        /*}
        else
        {
            while ((p != null) && (i < this.longitud) && (r != null))
            {
                if (p.getDato() == r.getDato())
                {
                    p = p.getLd();
                    r = r.getLd();
                }
                else
                {
                    System.out.println("No es subhilera");
                    x = false;
                }
                i++;
            }
            if (p == null && r == null)
            {
                System.out.println("Son iguales");
                x = true;
            }
            else
            {
                System.out.println("No es subhilera");
            }
        }*/
        return x;
    }
    
    /**
     * Éste método copia la hilera original
     * @return 
     */
    public Hilera copiar()
    {
        Hilera s = new Hilera();
        NodoDoble p = this.primero;
        for (int i = 0; i < this.longitud; i++)
        {
            s.insertarCaracter((char)p.getDato());
            p = p.getLd();
        }
        return s;
    }   
    
    /**
     * Nos retorna un booleano diciendo si la hilera es palíndromo o no
     * @return 
     */
    public boolean esPalindromo()
    {
        boolean x = true;
        Hilera h = this.copiar();
        NodoDoble p = this.primero;
        NodoDoble r = h.ultimo;
        for (int i = 0; i < this.longitud; i++)
        {
            if (p.getDato() != r.getDato())
            {
                x = false;
                System.out.println("No es palíndromo");
                return x;
            }
        }
        System.out.println("Sí es palíndromo");
        return x;
    }
    
    /**
     * Nos retorna un booleano diciendo si una hilera nueva es anagrama de la hilera original
     * @param h
     * @return 
     */
    public boolean esAnagrama(Hilera h)
    {   
        
        boolean x = false;
        Hilera hilera2 = h.copiar();
        NodoDoble p = this.primero;
        NodoDoble r = hilera2.primero;
        NodoDoble aux;
        if (this.longitud == h.longitud) {
            for (int i = 0; i < this.longitud; i++)
            {
            r = hilera2.primero;
            boolean val = false;
            while (!hilera2.esVacia() && val == false) {
                 aux = r.getLd();
                 if (r.getDato() == p.getDato()) {
                     val = true;
                     hilera2.eliminarNodo(r);
                }
                 r = aux;        
            }
            
            p = p.getLd();
            }
            if (hilera2.longitud == 0) {
            System.out.println("Sí es anagrama");
            x = true;
            }
        }
        
        
        
        
        
        return x;
    }

    /**
     * Borra la hilera original
     */
    public void borrerHilera()
    {
        primero = null;
        ultimo = null;
        longitud = 0;
    }
    
    /**
     * Nos desconecta el nodo que tiene como parámetro la dirección de memoria
     * @param i 
     */
    public void borrarDatoi(int i){
        desconectar(getNodoI(i));
    }


}
