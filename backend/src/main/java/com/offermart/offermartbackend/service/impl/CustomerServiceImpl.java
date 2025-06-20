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
        // FR1: Id]Y�H[��[[ݙH\X�]H�\��Y\�[��Y\�[ۘ[�\��Y\��^\�[�ОQ[XZ[H�\��Y\��\��]ܞK��[��Q[XZ[
�\��Y\���][XZ[

JN�[ۘ[�\��Y\��^\�[�ОTۙS�[X�\�H�\��Y\��\��]ܞK��[��TۙS�[X�\��\��Y\���]ۙS�[X�\�
JN�Y�^\�[�ОQ[XZ[�\��\�[�

H^\�[�ОTۙS�[X�\��\��\�[�

J^�\��Y\���]\�\X�]J�YJN����\�\�H\X�]H�܈���B��\�[K��]��[���\X�]H�\��Y\�]X�Y��
��\��Y\���][XZ[

H
����
��\��Y\���]ۙS�[X�\�
JNH[�H�\��Y\���]\�\X�]J�[�JNB��]\���\��Y\��\��]ܞK��]�J�\��Y\�NB�P�ݙ\��YB�X�X�\��\��Y\���][�\��Y\��
H�]\���\��Y\��\��]ܞK��[�[�    }
	BOverride
    publlic List<Customer> getDuplicateCustomers() {
        return customerRepository.findByIsDuplicate(true);
    }
	BOverride
    public List<Customer> getUniqueCustomers�)[ {:        return customerRepository.findByIsDuplicate(false);
    }
}