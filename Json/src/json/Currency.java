/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

public class Currency {

public double selling;
public double buying;
public double change_rate;
public String name;
public String fullName;
public String code;
public int curr;

public double getSelling() {
return selling;
}

public void setSelling(double selling) {
this.selling = selling;
}

public double getBuying() {
return buying;
}

public void setBuying(int buying) {
this.buying = buying;
}

public double getChange_rate() {
return change_rate;
}

public void setChange_rate(double change_rate) {
this.change_rate = change_rate;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getFullName() {
return fullName;
}

public void setFullName(String fullName) {
this.fullName = fullName;
}

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

/**
* @return the currency
*/
public int getCurrency() {
return curr;
}

/**
* @param currency the currency to set
*/
public void setCurrency(int curr) {
this.curr = curr;
}

}
