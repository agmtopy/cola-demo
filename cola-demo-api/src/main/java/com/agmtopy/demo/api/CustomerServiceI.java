package com.agmtopy.demo.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.agmtopy.demo.dto.CustomerAddCmd;
import com.agmtopy.demo.dto.CustomerListByNameQry;
import com.agmtopy.demo.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
