package br.com.erudio.rest_with_spring_boot_and_java.services;

import br.com.erudio.rest_with_spring_boot_and_java.exceptions.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double sum(String num1, String num2){
        return this.verifyIsDouble(num1) + this.verifyIsDouble(num2);
    }

    public Double sub(String num1, String num2){
        return this.verifyIsDouble(num1) - this.verifyIsDouble(num2);
    }

    public Double mul(String num1, String num2){
        return this.verifyIsDouble(num1) * this.verifyIsDouble(num2);
    }

    public Double div(String num1, String num2){
        return this.verifyIsDouble(num1) / this.verifyIsDouble(num2);
    }

    public Double sqr(String n1){
        return Math.sqrt(this.verifyIsDouble(n1));
    }

    public Double verifyIsDouble(String num){
        if(!isNumeric(num)) throw new UnsupportedMathOperationException("Mathematical operation not supported!");
        return convertDouble(num);
    }

    private Double convertDouble(String strNumber) {
        if(strNumber == null) return 0D;

        String number = strNumber.replaceAll(",", ".");
        if(isNumeric(number)) return Double.parseDouble(number);

        return 0D;
    }

    private boolean isNumeric(String num1) {
        if(num1 == null) return false;
        String number = num1.replaceAll(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
