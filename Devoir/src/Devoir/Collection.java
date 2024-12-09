package Devoir;

import java.util.LinkedList;

public class Collection {
	LinkedList <Integer> liste =new LinkedList<>();
	public void arrayListTrie(Integer n)throws Except {
		if(n>0)
		   liste.add(n);
		else {
			throw new Except("L'entier doit etre positif");
		}
	}
	public void affiche(LinkedList l) {
		for(int i =0; i<l.size();i++)
			System.out.println(l.get(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection p=new Collection() ;
		try{p.arrayListTrie(4);
		p.arrayListTrie(-3);
		}catch(Except e) {
			System.out.println("Exception capturee "+e.getMessage());
		}
		try{
		p.arrayListTrie(9);
		}catch(Except e) {
			System.out.println("Exception capturee "+e.getMessage());
		}finally{
		p.liste.sort(null);
		p.affiche(p.liste);}
	}

}
