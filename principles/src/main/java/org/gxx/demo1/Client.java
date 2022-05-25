package org.gxx.demo1;

public class Client {
    public static void main(String[] args) {
        SouGouInput souGouInput = new SouGouInput();
//        DefaultSkin defaultSkin = new DefaultSkin();
        HeimaSkin defaultSkin = new HeimaSkin();
        souGouInput.setAbstractSkin(defaultSkin);
        souGouInput.display();

    }
}
