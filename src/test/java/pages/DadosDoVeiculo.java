package pages;

import org.openqa.selenium.By;

import iteracoes.Iteracoes;

public class DadosDoVeiculo {

	Iteracoes i = new Iteracoes();

	// Elementos da página Dados do Veículo
	private By make = By.id("make");
	private By enginePerformance = By.id("engineperformance");
	private By dateOfManufacture = By.id("dateofmanufacture");
	private By numberOfSeats = By.id("numberofseats");
	private By fuelType = By.id("fuel");
	private By listPrice = By.id("listprice");
	private By licensePlateNumber = By.id("licenseplatenumber");
	private By annualMileage = By.id("annualmileage");
	private By model = By.id("model");
	private By cylinderCapacity = By.id("cylindercapacity");
	private By radioYes = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]");
	private By numberOfSeatsMotorCycle = By.id("numberofseatsmotorcycle");
	private By payload = By.id("payload");
	private By totalWeight = By.id("totalweight");
	private By btnNext = By.id("nextenterinsurantdata");

	// Método para abrir a URL
	public void abrirUrl() {
		i.abrirUrl("http://sampleapp.tricentis.com/101/app.php");
		i.aguardar(5);
	}

	// Métodos para preencher os campos dos Dados do Veículo
	public void preencherOsDadosDoVeiculo() {
		i.selecionarCombo(make, "Audi");
		i.escrever(enginePerformance, "40");
		i.escrever(dateOfManufacture, "02/14/2020");
		i.selecionarCombo(numberOfSeats, "4");
		i.selecionarCombo(fuelType, "Petrol");
		i.escrever(listPrice, "50000");
		i.escrever(licensePlateNumber, "123456");
		i.escrever(annualMileage, "100");
		i.selecionarCombo(model, "Three-Wheeler");
		i.escrever(cylinderCapacity, "200");
		i.clicar(radioYes);
		i.selecionarCombo(numberOfSeatsMotorCycle, "3");
		i.escrever(payload, "300");
		i.escrever(totalWeight, "400");
	}

	public void clicarEmNext() {
		i.clicar(btnNext);

	}
}
