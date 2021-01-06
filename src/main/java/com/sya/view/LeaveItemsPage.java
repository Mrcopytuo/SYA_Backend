package com.sya.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sya.common.Pagination;
import com.sya.model.LeaveInformation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.stream.Collectors;

@Data
@EqualsAndHashCode(callSuper = false)
public class LeaveItemsPage extends Pagination {

    @JsonProperty("leavelist")
    private List<LeaveItem> leaveItemList;

    public LeaveItemsPage(Page<LeaveInformation> leaveInformationPage){
        setPageNum(leaveInformationPage.getNumber());
        setPageSize(leaveInformationPage.getSize());
        setTotalPage(leaveInformationPage.getTotalPages());
        setLeaveItemList(leaveInformationPage);
    }

    private void setLeaveItemList(Page<LeaveInformation> leaveInformationPage){
        setLeaveItemList(
                leaveInformationPage
                        .stream()
                        .map(LeaveItem::new)
                        .collect(Collectors.toList())
        );
    }

    public void setLeaveItemList(List<LeaveItem> leaveItemList){
        this.leaveItemList = leaveItemList;
    }
}
