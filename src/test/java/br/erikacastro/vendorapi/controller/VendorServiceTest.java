package br.erikacastro.vendorapi.controller;

import br.erikacastro.vendorapi.model.Vendor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Erika Castro
 * Test Service Controller REST CRUD EndPoints
 **/

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class VendorServiceTest {
    @InjectMocks
    private VendorService vendorService;

    private Vendor vendor;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
        vendor = new Vendor();
        vendor.setVendorId("1");
        vendor.setVendorName("Erika Cristina Castro");
        vendor.setVendorAddress("Rua Pedro Braite");
        vendor.setAge("33");
        vendor.setVendorPhoneNumber("xxx");
        vendor.setCityName("Mogi Mirim");

        vendorService = new VendorService();

    }

    @Test
    void testGetVendorDetails() {
        vendorService.getVendorDetails(vendor.getVendorId());
        assertNotNull(vendor);
        assertNotNull(vendorService);
    }

    @Test
    void testCreateVendorDetails() {
        vendorService.createVendorDetails(vendor);
        assertNotNull(vendor);
        assertNotNull(vendorService);
    }

    @Test
    void testUpdateVendorDetails() {
        vendorService.updateVendorDetails(vendor);
        assertNotNull(vendor);
        assertNotNull(vendorService);
    }

    @Test
    void testRemoveVendorDetails() {
        vendorService.removeVendorDetails(vendor.getVendorId());
        assertNotNull(vendor);
        assertNotNull(vendorService);
    }
}
