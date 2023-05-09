package com.example.patronproxy.clases;

public class ServiceProxy implements IService{

    private final IService iService;

    public ServiceProxy(IService iService){
        this.iService = iService;
    }

    @Override
    public void doSomeThing() {
        before();
        iService.doSomeThing();
        after();
    }


    private void before(){
        System.out.println("Nacer");
    }


    private void after(){
        System.out.println("Morir");
    }


}
