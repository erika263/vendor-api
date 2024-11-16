package br.erikacastro.vendorapi.controller;


import br.erikacastro.vendorapi.model.Vendor;
import org.springframework.web.bind.annotation.*;

/**
 * @author Erika Castro
 * Service Controller REST CRUD EndPoints
 **/
@RestController
@RequestMapping("/vendors")
public class VendorService {
    String successMessage = "Vendor created with success";
    String updateMessage = "Vendor updated with success";
    String removeMessage = "Vendor removed with success";
    Vendor vendor;

    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(String vendorId) {
        return vendor;
    }

    @PostMapping
    public String createVendorDetails(@RequestBody Vendor vendor) {
        this.vendor = vendor;
        return successMessage;
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody Vendor vendor) {
        this.vendor = vendor;
        return updateMessage;
    }

    @DeleteMapping("{vendorId}")
    public String removeVendorDetails(String vendorId) {
        this.vendor = null;
        return removeMessage;
    }
}
