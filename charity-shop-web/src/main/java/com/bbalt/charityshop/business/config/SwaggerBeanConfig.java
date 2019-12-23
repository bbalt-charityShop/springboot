package com.bbalt.charityshop.business.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "swagger.config")
public class SwaggerBeanConfig {

    private String basePackage;
    private String version;
    private String title;
    private String description;
    private String termsOfServiceUrl;
    private String license;
    private String licenseUrl;
    private Contact contact;
    private List<VendorExtension> vendorExtensions;

    /**
     * Getter method for
     * property <tt>basePackage</tt>.
     *
     * @return property
     * value of basePackage
     */
    public String getBasePackage() {
        return basePackage;
    }

    /**
     * Setter method for property
     * <tt>basePackage</tt>.
     *
     * @param basePackage value to be assigned to property
     *                    basePackage
     */
    public void setBasePackage(String basePackage) {

        this.basePackage = basePackage;
    }

    /**
     * Getter method for
     * property <tt>version</tt>.
     *
     * @return property
     * value of version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter method for property
     * <tt>version</tt>.
     *
     * @param version value to be assigned to property
     *                version
     */
    public void setVersion(String version) {

        this.version = version;
    }

    /**
     * Getter method for
     * property <tt>title</tt>.
     *
     * @return property
     * value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property
     * <tt>title</tt>.
     *
     * @param title value to be assigned to property
     *              title
     */
    public void setTitle(String title) {

        this.title = title;
    }

    /**
     * Getter method for
     * property <tt>description</tt>.
     *
     * @return property
     * value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property
     * <tt>description</tt>.
     *
     * @param description value to be assigned to property
     *                    description
     */
    public void setDescription(String description) {

        this.description = description;
    }

    /**
     * Getter method for
     * property <tt>termsOfServiceUrl</tt>.
     *
     * @return property
     * value of termsOfServiceUrl
     */
    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    /**
     * Setter method for property
     * <tt>termsOfServiceUrl</tt>.
     *
     * @param termsOfServiceUrl value to be assigned to property
     *                          termsOfServiceUrl
     */
    public void setTermsOfServiceUrl(String termsOfServiceUrl) {

        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    /**
     * Getter method for
     * property <tt>license</tt>.
     *
     * @return property
     * value of license
     */
    public String getLicense() {
        return license;
    }

    /**
     * Setter method for property
     * <tt>license</tt>.
     *
     * @param license value to be assigned to property
     *                license
     */
    public void setLicense(String license) {

        this.license = license;
    }

    /**
     * Getter method for
     * property <tt>licenseUrl</tt>.
     *
     * @return property
     * value of licenseUrl
     */
    public String getLicenseUrl() {
        return licenseUrl;
    }

    /**
     * Setter method for property
     * <tt>licenseUrl</tt>.
     *
     * @param licenseUrl value to be assigned to property
     *                   licenseUrl
     */
    public void setLicenseUrl(String licenseUrl) {

        this.licenseUrl = licenseUrl;
    }

    /**
     * Getter method for
     * property <tt>contact</tt>.
     *
     * @return property
     * value of contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Setter method for property
     * <tt>contact</tt>.
     *
     * @param contact value to be assigned to property
     *                contact
     */
    public void setContact(Contact contact) {

        this.contact = contact;
    }

    /**
     * Getter method for
     * property <tt>vendorExtensions</tt>.
     *
     * @return property
     * value of vendorExtensions
     */
    public List<VendorExtension> getVendorExtensions() {
        return vendorExtensions;
    }

    /**
     * Setter method for property
     * <tt>vendorExtensions</tt>.
     *
     * @param vendorExtensions value to be assigned to property
     *                         vendorExtensions
     */
    public void setVendorExtensions(List<VendorExtension> vendorExtensions) {

        this.vendorExtensions = vendorExtensions;
    }
}
