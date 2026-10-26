package ma.supmti.payflow.dtos;


import lombok.Data;
import ma.supmti.payflow.enums.AccountStatus;

import java.util.Date;


@Data
public class CurrentBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createDate;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}
