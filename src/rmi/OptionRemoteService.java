package rmi;

import models.Option;
import models.Question;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface OptionRemoteService extends Remote {
    void addOption(Option option) throws RemoteException;
    List<Option> getOptionsByQuestion(int questionId) throws RemoteException;
    void deleteOption(int id) throws RemoteException;

    void updateOption(Option option) throws RemoteException;
}
