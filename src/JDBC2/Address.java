package src.JDBC2;

public class Address {
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String pinCode;

    public Address( String addressLine1,
    String addressLine2,String city,String state,String pinCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.state=state;
        this.city=city;
        this.pinCode = pinCode;
    }
        @Override
        public String toString() {
            return "AddressLine1="+addressLine1+'\n'+
                    "AddressLine2="+addressLine2+'\n'+
                    "City="+city+'\n'+
                    "State="+state+'\n'+
                    "PinCode="+ pinCode +'\n';
    }

    }


