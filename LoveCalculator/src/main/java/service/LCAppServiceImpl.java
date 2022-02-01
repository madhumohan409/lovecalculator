package service;

import org.springframework.stereotype.Service;

@Service
public class LCAppServiceImpl implements LCAppService {
	public String FORMULA_APP="FLAME";

	@Override
	public String CalculateLove(String userName, String crushName) {
		// TODO Auto-generated method stub
                    
	int userAndcrushTotal =(userName+crushName).toCharArray().length;
	 int FormulaCount = (FORMULA_APP).toCharArray().length;
	         int rem =userAndcrushTotal%FormulaCount ;
	         char Calculationresult = FORMULA_APP.charAt(rem);
	         String result = WhatsBetweenUs(Calculationresult);
	         return result;
	         
	}

	@Override
	public String WhatsBetweenUs(char Calculationresult) {
	
		String result=null;
		if(Calculationresult=='F') {
			return LoveCalculatorConstants.F_CHAR_MEANING;
			
		}else if(Calculationresult=='L') {
			return LoveCalculatorConstants.L_CHAR_MEANING;
		}else if(Calculationresult=='A') {
			return LoveCalculatorConstants.A_CHAR_MEANING;
		}
		else if(Calculationresult=='M') {
			return LoveCalculatorConstants.M_CHAR_MEANING;
		}
		else if(Calculationresult=='E') {
			return LoveCalculatorConstants.E_CHAR_MEANING;
		}
		return result;
	

	

	}
}
