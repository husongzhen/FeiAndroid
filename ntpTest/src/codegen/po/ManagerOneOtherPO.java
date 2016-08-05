package codegen.po;

import java.io.Serializable;
import java.util.List;

public class ManagerOneOtherPO implements Serializable {
    private long mManagerGroupId;
    private int mManagerGroupMaxCount;
    private String mManagerGroupName;
    private ManageModulePO mManageModulePO;
    private List<ManageModulePO> mManageModuleVOs;

    public ManagerOneOtherPO() {
    }

    public ManageModulePO getManageModulePO() {
        return mManageModulePO;
    }

    public void setManageModulePO(ManageModulePO manageModulePO) {
        mManageModulePO = manageModulePO;
    }

    public long getManagerGroupId() {
        return this.mManagerGroupId;
    }

    public void setManagerGroupId(long value) {
        this.mManagerGroupId = value;
    }

    public int getManagerGroupMaxCount() {
        return this.mManagerGroupMaxCount;
    }

    public void setManagerGroupMaxCount(int value) {
        this.mManagerGroupMaxCount = value;
    }

    public String getManagerGroupName() {
        return this.mManagerGroupName;
    }

    public void setManagerGroupName(String value) {
        this.mManagerGroupName = value;
    }

    public List<ManageModulePO> getManageModuleVOs() {
        return mManageModuleVOs;
    }

    public void setManageModuleVOs(List<ManageModulePO> manageModuleVOs) {
        mManageModuleVOs = manageModuleVOs;
    }
}