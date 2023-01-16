package com.agmtopy.demo.configure.customer;

import com.agmtopy.demo.configure.customer.executor.CustomerAddCmdExe;
import com.agmtopy.demo.configure.customer.executor.query.CustomerListByNameQryExe;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.agmtopy.demo.api.CustomerServiceI;
import com.agmtopy.demo.dto.CustomerAddCmd;
import com.agmtopy.demo.dto.CustomerListByNameQry;
import com.agmtopy.demo.dto.data.CustomerDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}