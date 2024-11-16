package br.erikacastro.vendorapi.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class VendorTest {
    Vendor vendor;

    @Test
    public void testVendorClass() {
        vendor = new Vendor();
        vendor.setVendorId("1");
        vendor.setVendorName("Erika Cristina Castro");
        vendor.setVendorAddress("Rua Pedro Braite");
        vendor.setAge("33");
        vendor.setVendorPhoneNumber("xxx");
        vendor.setCityName("Mogi Mirim");

        assertEquals(vendor.getVendorId(),"1");
        assertEquals(vendor.getVendorName(),"Erika Cristina Castro");
        assertEquals(vendor.getVendorAddress(),"Rua Pedro Braite");
        assertEquals(vendor.getAge(),"33");
        assertEquals(vendor.getVendorPhoneNumber(),"xxx");
        assertEquals(vendor.getCityName(),"Mogi Mirim");

        vendor = new Vendor("1","Erika Cristina Castro","Rua Pedro Braite","33","xxx","Mogi Mirim");
    }
}
