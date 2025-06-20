package com.offermart.offermartbackend.service.impl;
import com.offermart.offermartbackend.model.Customer;
import com.offermart.offermartbackend.repository.CustomerRepository;
import com.offermart.offermartbackend.service.CustomerService;
import org.springframework.beans.factory.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.optional.Optional;
@Service
Public class CustomerServiceImpl implements CustomerService {
	 @Autowired
    private CustomerRepository customerRepository;
	@Override
    public Customer process NewCustomer(Customer customer) {
        // FR1: Id]YH[™™[[İ™H\XØ]Hİ\İÛY\ˆ[šY\ÂˆÜ[Û˜[İ\İÛY\ˆ^\İ[™ĞQ[XZ[Hİ\İÛY\”™\ÜÚ]ÜK™š[™Q[XZ[
İ\İÛY\‹™Ù][XZ[

JNÂˆÜ[Û˜[İ\İÛY\ˆ^\İ[™ĞTÛ™S[X™\ˆHİ\İÛY\”™\ÜÚ]ÜK™š[™TÛ™S[X™\Šİ\İÛY\‹™Ù]Û™S[X™\Š
JNÂ‚ˆYŠ^\İ[™ĞQ[XZ[š\Ô™\Ù[

H^\İ[™ĞTÛ™S[X™\‹š\Ô™\Ù[

J^Âˆİ\İÛY\‹œÙ]\Ñ\XØ]JYJNÂˆËÈÑÈ\È\ÈH\XØ]H›Üˆ”‘BˆŞ\İ[K›İ]œš[Š‘\XØ]Hİ\İÛY\ˆ]XİYˆˆ
Èİ\İÛY\‹™Ù][XZ[

H
ÈˆÈˆ
Èİ\İÛY\‹™Ù]Û™S[X™\Š
JNÂˆH[ÙHÂˆİ\İÛY\‹œÙ]\Ñ\XØ]J˜[ÙJNÂˆBˆ™]\›ˆİ\İÛY\”™\ÜÚ]ÜKœØ]™Jİ\İÛY\ŠNÂˆB‚P“İ™\œšYBˆX›XÈ\İİ\İÛY\ˆÙ][İ\İÛY\œÊ
HÂˆ™]\›ˆİ\İÛY\”™\ÜÚ]ÜK™š[™[‚    }
	BOverride
    publlic List<Customer> getDuplicateCustomers() {
        return customerRepository.findByIsDuplicate(true);
    }
	BOverride
    public List<Customer> getUniqueCustomers )[ {:        return customerRepository.findByIsDuplicate(false);
    }
}