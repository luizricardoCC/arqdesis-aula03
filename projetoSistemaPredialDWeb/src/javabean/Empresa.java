package javabean;


public class Empresa
{

	private String  razaoSocial, conjunto, horFunc, horFuncAC;
   private long cnpj;
   private int valorMaxAC;
   
   //Construtor Padrão
   public Empresa()
   {
      this(-1,null,null,null,null,-1);
   }
   
   
   //Construtor Parametrizado
   public Empresa(long cnpj, String razaoSocial, String conjunto, String horFunc, String horFuncAC, int valorMaxAC)
   {
      setCnpj(cnpj);
      setRazaoSocial(razaoSocial);
      setConjunto(conjunto);
      setHorFunc(horFunc);
      setHorFuncAC(horFuncAC);
      setValorMaxAC(valorMaxAC);
   }

      
   //Get's e Set's
   public void setCnpj(Long cnpj)
   {
      this.cnpj = cnpj;
   } 
   
   public long getCnpj()
   {
      return cnpj;
   }
   
   public void setRazaoSocial(String razaoSocial)
   {
      this.razaoSocial = razaoSocial;
   }
   
   public String getRazaoSocial()
   {
      return razaoSocial;
   }
   
   public void setConjunto(String conjunto)
   {
      this.conjunto = conjunto;
   }
   
   public String getConjunto()
   {
      return conjunto;
   }
   
   public void setHorFunc(String horFunc)
   {
      this.horFunc = horFunc;
   }
   
   public String getHorFunc()
   {
      return horFunc;
   }
   
   public void setHorFuncAC(String horFuncAC)
   {
      this.horFuncAC = horFuncAC;
   }
   
   public String getHorFuncAC()
   {
      return horFuncAC;
   }
   
   public void setValorMaxAC(int valorMaxAC)
   {
      this.valorMaxAC = valorMaxAC;
   }
   
   public int getValorMaxAC()
   {
      return valorMaxAC;
   }
   
   @Override
	public String toString() {
		return "EmpresaTO [cnpj=" + cnpj + ", "
				+ "razaoSocial=" + razaoSocial 
				+ ", conjunto=" + conjunto 
				+ ", horFunc=" + horFunc 
				+ ", horFuncAC=" + horFuncAC 
				+ ", valorMaxAC=" + valorMaxAC 
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj != other.cnpj)
			return false;
		if (conjunto == null) {
			if (other.conjunto != null)
				return false;
		} else if (!conjunto.equals(other.conjunto))
			return false;
		if (horFunc == null) {
			if (other.horFunc != null)
				return false;
		} else if (!horFunc.equals(other.horFunc))
			return false;
		if (horFuncAC == null) {
			if (other.horFuncAC != null)
				return false;
		} else if (!horFuncAC.equals(other.horFuncAC))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (valorMaxAC != other.valorMaxAC)
			return false;
		return true;
	}
   

   
}