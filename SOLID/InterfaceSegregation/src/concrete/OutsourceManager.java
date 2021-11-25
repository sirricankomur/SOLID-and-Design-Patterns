package concrete;

import abstracts.service.IPayService;
import abstracts.service.IWorkService;
import abstracts.service.IWorker;
import entity.Outsource;

public class OutsourceManager implements IWorkService, IPayService {

    private IWorker _worker;

    public OutsourceManager(Outsource outsource) {
        _worker = outsource;
    }

    @Override
    public void calculateWorkingHour() {
        System.out.println("Outsource Worker, çalışma saati hesaplandı.");
    }

    @Override
    public void calculatePay() {
        System.out.println("Outsource Worker, ücreti hesaplandı.");
    }
}
