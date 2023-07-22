package org.session.example.association;

public class Mobile {
    private String mobileNo;
    //private String mobileName;

//    public String getMobileName() {
//        return mobileName;
//    }
//
//    public void setMobileName(String mobileName) {
//        this.mobileName = mobileName;
//    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
