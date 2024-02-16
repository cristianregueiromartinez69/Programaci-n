
package boletin_4;


public class Libro {
    
    private String libro,autor; private int ano;
	private short numPaginas; private float valoracion;
	private String libro2,autor2; private int ano2;
	private short numPaginas2; private float valoracion2;


	public Libro(String li, String au, int agno, short numpa) {

		libro=li; autor=au; ano=agno; numPaginas=numpa;

		}
	public Libro() {

	}
	public void setLibro2(String li2) {
		libro2=li2;
	}
	public String getLibro2() {
		return libro2;
	}
	public void setAutor2(String au2) {
		autor2=au2;
	}
	public String getAutor2() {
		return autor2;
	}
	public void setAno2(int a2) {
		ano2=a2;
	}
	public int getAno2() {
		return ano2;
	}
	public void setNumpa2(short numpag2) {
		numPaginas2=numpag2;
	}
	public short getnumpa2() {
		return numPaginas2;
	}
	public void setValoracion2(float va2) {
		valoracion2=va2;
	}
	public float getValoracion2() {
		return valoracion2;
	}
	public void setAmosar2() {
		System.out.println("Las características de libro2 son: ");
		System.out.println("Nombre del libro: " + libro2);
		System.out.println("Nombre del autor: " + autor2);
		System.out.println("Año de lanzamiento: " + ano2);
		System.out.println("Numero de páginas: " + numPaginas2);
		System.out.println("Valoración del libro: " + valoracion2);

	}
	public void setLibro(String li) {

		libro=li;
		}
	public String getLibro() {
		return libro;
	}

	public void setAutor(String au) {
		autor=au;
	}

	public String getAutor() {
		return autor;
	}
	public void setAño(int agno) {

		ano=agno;
	}
	public int getAño() {
		return ano;
	}
	public void setNumpa(short numpa) {
		numPaginas=numpa;
	}
	public short getNumeropag() {
		return numPaginas;
	}

	public void setAmosar() {

	System.out.println("Las características del libro son: ");
	System.out.println("Nombre del libro: " + libro);
	System.out.println("Nombre del autor: " + autor);
	System.out.println("Año de lanzamiento: " + ano);
	System.out.println("Número de páginas: " + numPaginas);



		}







    
    
    
    
    
}
