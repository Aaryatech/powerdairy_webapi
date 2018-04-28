package com.dairypower.webapi.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dairypower.webapi.model.LoginResponse;
import com.dairypower.webapi.model.master.BillPayment;
import com.dairypower.webapi.model.master.Currency;
import com.dairypower.webapi.model.master.Customer;
import com.dairypower.webapi.model.master.CustomerType;
import com.dairypower.webapi.model.master.GetCustomer;
import com.dairypower.webapi.model.master.GetItem;
import com.dairypower.webapi.model.master.GetUser;
import com.dairypower.webapi.model.master.Info;
import com.dairypower.webapi.model.master.Item;
import com.dairypower.webapi.model.master.ItemCategory;
import com.dairypower.webapi.model.master.MfgReturn;
import com.dairypower.webapi.model.master.RSHeader;
import com.dairypower.webapi.model.master.RsDetail;
import com.dairypower.webapi.model.master.TVehicle;
import com.dairypower.webapi.model.master.Uom;
import com.dairypower.webapi.model.master.User;
import com.dairypower.webapi.model.master.UserType;
import com.dairypower.webapi.model.master.Vehicle;
import com.dairypower.webapi.model.master.VehicleRes;
import com.dairypower.webapi.repository.BillPaymentRepository;
import com.dairypower.webapi.repository.CurrencyRepository;
import com.dairypower.webapi.repository.CustomerRepository;
import com.dairypower.webapi.repository.CustomerTypeRepository;
import com.dairypower.webapi.repository.GetCustomerRepository;
import com.dairypower.webapi.repository.GetItemRepository;
import com.dairypower.webapi.repository.GetUserRepository;
import com.dairypower.webapi.repository.ItemCategoryRepository;
import com.dairypower.webapi.repository.ItemRepository;
import com.dairypower.webapi.repository.MfgReturnRepository;
import com.dairypower.webapi.repository.RsDetailRepository;
import com.dairypower.webapi.repository.RsHeaderRepository;
import com.dairypower.webapi.repository.TVehicleRepository;
import com.dairypower.webapi.repository.UomRepository;
import com.dairypower.webapi.repository.UserRepository;
import com.dairypower.webapi.repository.UserTypeRepository;
import com.dairypower.webapi.repository.VehicleRepository;
import com.dairypower.webapi.repository.VehicleResRepository; 

@RestController
@RequestMapping("/master")
public class MasterController {

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	ItemCategoryRepository itemCategoryRepository;

	@Autowired
	GetItemRepository getItemRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	GetCustomerRepository getCustomerRepository;

	@Autowired
	UomRepository uomRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	GetUserRepository getUserRepository;

	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	CustomerTypeRepository custTypeRepository;

	@Autowired
	UserTypeRepository userTypeRepository;

	@Autowired
	RsHeaderRepository rsHeaderRepository;

	@Autowired
	RsDetailRepository rsDetailRepository;

	@Autowired
	TVehicleRepository tVehicleRepository;

	@Autowired
	MfgReturnRepository mfgReturnRepository;

	@Autowired
	CurrencyRepository currencyRepository;

	@Autowired
	BillPaymentRepository billPaymentRepository;
	@Autowired
	VehicleResRepository vehicleResRepository;

	// ----------------------------Save Item---------------------------
	@RequestMapping(value = { "/saveItem" }, method = RequestMethod.POST)
	public @ResponseBody Info saveItemSup(@RequestBody Item item) {

		Item itemRes = null;
		Info info = new Info();
		try {
			itemRes = itemRepository.saveAndFlush(item);

			if (itemRes != null) {
				info.setError(false);
				info.setMessage("Item Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("Item Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("Item Not Saved .");
			e.printStackTrace();

		}
		return info;

	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Save Item Category---------------------------
	@RequestMapping(value = { "/saveItemCategory" }, method = RequestMethod.POST)
	public @ResponseBody Info saveItemCategory(@RequestBody ItemCategory itemCategory) {

		ItemCategory itemCategoryRes = null;
		Info info = new Info();
		try {
			itemCategoryRes = itemCategoryRepository.saveAndFlush(itemCategory);

			if (itemCategoryRes != null) {
				info.setError(false);
				info.setMessage("Item Category Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("Item Category Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("Item Category Not Saved .");
			e.printStackTrace();

		}
		return info;

	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Add Customer-------------------------
	@RequestMapping(value = { "/saveCustomer" }, method = RequestMethod.POST)
	public @ResponseBody Info saveCustomer(@RequestBody Customer customer) {

		Customer custRes = null;
		Info info = new Info();
		try {
			custRes = customerRepository.saveAndFlush(customer);

			if (custRes != null) {
				info.setError(false);
				info.setMessage("Customer Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("Customer Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("Customer Not Saved .");
			e.printStackTrace();

		}
		return info;

	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Save Item Uom---------------------------
	@RequestMapping(value = { "/saveItemUom" }, method = RequestMethod.POST)
	public @ResponseBody Info saveItemUom(@RequestBody Uom uom) {

		Uom uomRes = null;
		Info info = new Info();
		try {
			uomRes = uomRepository.saveAndFlush(uom);

			if (uomRes != null) {
				info.setError(false);
				info.setMessage("Uom Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("Uom Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("Uom Not Saved .");
			e.printStackTrace();

		}
		return info;

	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Save User---------------------------
	@RequestMapping(value = { "/saveUser" }, method = RequestMethod.POST)
	public @ResponseBody Info saveUser(@RequestBody User user) {

		User userRes = null;
		Info info = new Info();
		try {
			userRes = userRepository.saveAndFlush(user);

			if (userRes != null) {
				info.setError(false);
				info.setMessage("User Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("User Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("User Not Saved .");
			e.printStackTrace();

		}
		return info;

	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Save Vehicle---------------------------
	@RequestMapping(value = { "/saveVehicle" }, method = RequestMethod.POST)
	public @ResponseBody Info saveVehicle(@RequestBody Vehicle vehicle) {

		Vehicle vehicleRes = null;
		Info info = new Info();
		try {
			vehicleRes = vehicleRepository.saveAndFlush(vehicle);

			if (vehicleRes != null) {
				info.setError(false);
				info.setMessage("Vehicle Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("Vehicle Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("Vehicle Not Saved .");
			e.printStackTrace();

		}
		return info;

	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Save Rate Structure---------------------------
	@RequestMapping(value = { "/saveRs" }, method = RequestMethod.POST)
	public @ResponseBody RSHeader saveRs(@RequestBody RSHeader rsHeader) {

		RSHeader rsHeadeRes = null;
		List<RsDetail> rsDetailList = new ArrayList<RsDetail>();
		try {
			rsHeadeRes = rsHeaderRepository.saveAndFlush(rsHeader);
			for (RsDetail rsDetail : rsHeader.getRsDetailList()) {
				rsDetail.setRsHeaderId(rsHeadeRes.getRsHeaderId());
				RsDetail rsDetailRes = rsDetailRepository.saveAndFlush(rsDetail);
				rsDetailList.add(rsDetailRes);
			}
			rsHeadeRes.setRsDetailList(rsDetailList);

		} catch (Exception e) {

			e.printStackTrace();

		}
		return rsHeadeRes;

	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Save Rate Details---------------------------
		@RequestMapping(value = { "/saveRsDetails" }, method = RequestMethod.POST)
		public @ResponseBody Info saveRsDetails(@RequestBody List<RsDetail> rsDetails) {

			Info info=null;
			try {
				List<RsDetail> rsDetailList=new ArrayList<>();
				for (RsDetail rsDetail :rsDetails) {
					RsDetail rsDetailRes = rsDetailRepository.saveAndFlush(rsDetail);
					rsDetailList.add(rsDetailRes);
				}
                if(rsDetailList.isEmpty())
                {
                	info=new Info();
                	info.setError(true);
                	info.setMessage("RsDetails Not Saved");
                }
                else
                {
                	info=new Info();
                	info.setError(false);
                	info.setMessage("RsDetails Saved Succcessfully");
                }
				
			} catch (Exception e) {

				e.printStackTrace();

			}
			return info;

		}

		// --------------------------------------------------------------------------------------
	// ------------------------DeleteItem------------------------------------
	@RequestMapping(value = { "/deleteItem" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteItem(@RequestParam int itemId) {

		int isDeleted = itemRepository.deleteItem(itemId);
		Info info = new Info();
		if (isDeleted == 1) {
			info.setError(false);
			info.setMessage("Item Deleted Successfully");
		} else {
			info.setError(true);
			info.setMessage("Item Deletion Failed");
		}
		return info;
	}

	// ------------------------------------------------------------------------
	// ------------------------Delete Category------------------------------------
	@RequestMapping(value = { "/deleteItemCategory" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteItemCategory(@RequestParam int catId) {

		int isDeleted = itemCategoryRepository.deleteItemCategory(catId);
		Info info = new Info();
		if (isDeleted == 1) {
			info.setError(false);
			info.setMessage("Category Deleted Successfully");
		} else {
			info.setError(true);
			info.setMessage("Category Deletion Failed");
		}
		return info;
	}

	// ------------------------------------------------------------------------
	// ------------------------Delete Customer------------------------------------
	@RequestMapping(value = { "/deleteCustomer" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteCustomer(@RequestParam int custId) {

		int isDeleted = customerRepository.deleteCustomer(custId);
		Info info = new Info();
		if (isDeleted == 1) {
			info.setError(false);
			info.setMessage("Customer Deleted Successfully");
		} else {
			info.setError(true);
			info.setMessage("Customer Deletion Failed");
		}
		return info;
	}

	// ------------------------------------------------------------------------
	// ------------------------Delete RsHeader------------------------------------
	@RequestMapping(value = { "/deleteRsHeader" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteRsHeader(@RequestParam int rsHeaderId) {

		int isDeleted = rsHeaderRepository.deleteRsHeader(rsHeaderId);
		Info info = new Info();
		if (isDeleted == 1) {
			info.setError(false);
			info.setMessage("Rate Structure Deleted Successfully");
		} else {
			info.setError(true);
			info.setMessage("Rate Structure Deletion Failed");
		}
		return info;
	}

	// ------------------------------------------------------------------------
	// ------------------------Delete Uom------------------------------------
	@RequestMapping(value = { "/deleteUom" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteUom(@RequestParam int uomId) {

		int isDeleted = uomRepository.deleteUom(uomId);
		Info info = new Info();
		if (isDeleted == 1) {
			info.setError(false);
			info.setMessage("Uom Deleted Successfully");
		} else {
			info.setError(true);
			info.setMessage("Uom Deletion Failed");
		}
		return info;
	}

	// ------------------------------------------------------------------------
	// ------------------------Delete User------------------------------------
	@RequestMapping(value = { "/deleteUser" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteUser(@RequestParam int userId) {

		int isDeleted = userRepository.deleteUser(userId);
		Info info = new Info();
		if (isDeleted == 1) {
			info.setError(false);
			info.setMessage("User Deleted Successfully");
		} else {
			info.setError(true);
			info.setMessage("User Deletion Failed");
		}
		return info;
	}

	// ------------------------------------------------------------------------
	// ------------------------Delete Vehicle------------------------------------
	@RequestMapping(value = { "/deleteVehicle" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteVehicle(@RequestParam int vehId) {

		int isDeleted = vehicleRepository.deleteVehicle(vehId);
		Info info = new Info();
		if (isDeleted == 1) {
			info.setError(false);
			info.setMessage("Vehicle Deleted Successfully");
		} else {
			info.setError(true);
			info.setMessage("Vehicle Deletion Failed");
		}
		return info;
	}

	// ------------------------------------------------------------------------
	// Get All Categories
	@RequestMapping(value = "/getAllCategories", method = RequestMethod.GET)
	public @ResponseBody List<ItemCategory> getAllCategories() {

		List<ItemCategory> list = new ArrayList<>();
		Iterable<ItemCategory> categoryList = itemCategoryRepository.findAllByIsUsed(0);
		categoryList.forEach(list::add);

		return list;
	}

	// ------------------------------------------------------------------------
	@RequestMapping(value = "/getAllItems", method = RequestMethod.GET)
	public @ResponseBody List<GetItem> getAllItems() {

		List<GetItem> itemList;
		try {
			itemList = getItemRepository.findAllByIsUsed();
		} catch (Exception e) {
			itemList = new ArrayList<>();
			e.printStackTrace();

		}
		return itemList;

	}

	// ------------------------------------------------------------------------
	// ------------------------------------------------------------------------
	@RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET)
	public @ResponseBody List<GetCustomer> getAllCustomer() {

		List<GetCustomer> custList;
		try {
			custList = getCustomerRepository.findAllByIsUsed();
		} catch (Exception e) {
			custList = new ArrayList<>();
			e.printStackTrace();

		}
		return custList;

	}

	// ------------------------------------------------------------------------
	// Get All Categories
	@RequestMapping(value = "/getAllUom", method = RequestMethod.GET)
	public @ResponseBody List<Uom> getAllUom() {

		List<Uom> uomList;
		try {
			uomList = uomRepository.findAllByIsUsed(0);
		} catch (Exception e) {
			uomList = new ArrayList<>();
			e.printStackTrace();

		}
		return uomList;
	}

	// ------------------------------------------------------------------------
	// ------------------------------------------------------------------------
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public @ResponseBody List<GetUser> getAllUsers() {

		List<GetUser> userList;
		try {
			userList = getUserRepository.findAllByIsUsed();
		} catch (Exception e) {
			userList = new ArrayList<>();
			e.printStackTrace();

		}
		return userList;
	}

	// ------------------------------------------------------------------------
	// ------------------------------------------------------------------------
	@RequestMapping(value = "/getAllVehicles", method = RequestMethod.GET)
	public @ResponseBody List<Vehicle> getAllVehicles() {

		List<Vehicle> vehicleList;
		try {
			vehicleList = vehicleRepository.findAllByIsUsed(0);
		} catch (Exception e) {
			vehicleList = new ArrayList<>();
			e.printStackTrace();

		}
		return vehicleList;
	}

	// ------------------------------------------------------------------------
	// ------------------------------------------------------------------------
	@RequestMapping(value = "/getAllCustType", method = RequestMethod.GET)
	public @ResponseBody List<CustomerType> getAllCustType() {

		List<CustomerType> custTypeList;
		try {
			custTypeList = custTypeRepository.findAllByIsUsed(0);
		} catch (Exception e) {
			custTypeList = new ArrayList<>();
			e.printStackTrace();

		}
		return custTypeList;
	}

	// ------------------------------------------------------------------------
	// ------------------------------------------------------------------------
	@RequestMapping(value = "/getAllUserType", method = RequestMethod.GET)
	public @ResponseBody List<UserType> getAllUserType() {

		List<UserType> userTypeList;
		try {
			userTypeList = userTypeRepository.findAllByIsUsed(0);
		} catch (Exception e) {
			userTypeList = new ArrayList<>();
			e.printStackTrace();

		}
		return userTypeList;
	}

	// ------------------------------------------------------------------------

	// ------------------------Getting Item by Id-----------------------
	@RequestMapping(value = { "/getItemById" }, method = RequestMethod.POST)
	public @ResponseBody GetItem getItemById(@RequestParam("itemId") int itemId) {

		GetItem getItem = getItemRepository.findItemById(itemId);

		return getItem;
	}

	// -------------------------------------------------------------------------
	// ------------------------Getting Item Category by Id-----------------------
	@RequestMapping(value = { "/getCategoryById" }, method = RequestMethod.POST)
	public @ResponseBody ItemCategory getCategoryById(@RequestParam("catId") int catId) {

		ItemCategory itemCategory = itemCategoryRepository.findByCatId(catId);

		return itemCategory;
	}

	// -------------------------------------------------------------------------
	// ------------------------Getting Customer by Id-----------------------
	@RequestMapping(value = { "/getCustomerById" }, method = RequestMethod.POST)
	public @ResponseBody Customer getCustomerById(@RequestParam("custId") int custId) {

		Customer customer = customerRepository.findByCustId(custId);

		return customer;
	}

	// -------------------------------------------------------------------------
	// ------------------------Getting Uom by Id-----------------------
	@RequestMapping(value = { "/getUomById" }, method = RequestMethod.POST)
	public @ResponseBody Uom getUomById(@RequestParam("uomId") int uomId) {

		Uom uomRes = uomRepository.findUomByUomId(uomId);

		return uomRes;
	}

	// -------------------------------------------------------------------------
	// ------------------------Getting User by Id-----------------------
	@RequestMapping(value = { "/getUserById" }, method = RequestMethod.POST)
	public @ResponseBody User getUserById(@RequestParam("userId") int userId) {

		User userRes = userRepository.findUserByUserId(userId);

		return userRes;
	}

	// -------------------------------------------------------------------------
	// ------------------------Getting User by Id-----------------------
	@RequestMapping(value = { "/getVehicleById" }, method = RequestMethod.POST)
	public @ResponseBody Vehicle getVehicleById(@RequestParam("vehId") int vehId) {

		Vehicle vehicleRes = vehicleRepository.findVehicleByVehId(vehId);

		return vehicleRes;
	}

	// -------------------------------------------------------------------------
	// ----------------------------Save TVehicle---------------------------
	@RequestMapping(value = { "/saveTVehicle" }, method = RequestMethod.POST)
	public @ResponseBody Info saveTVehicle(@RequestBody TVehicle tVehicle) {

		TVehicle tVehicleRes = null;
		Info info = new Info();
		try {
			tVehicleRes = tVehicleRepository.saveAndFlush(tVehicle);

			if (tVehicleRes != null) {
				info.setError(false);
				info.setMessage("TVehicle Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("TVehicle Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("TVehicle Not Saved .");
			e.printStackTrace();

		}
		return info;

	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Save MfgReturn---------------------------
	@RequestMapping(value = { "/saveMfgReturn" }, method = RequestMethod.POST)
	public @ResponseBody Info saveMfgReturn(@RequestBody MfgReturn mfgReturn) {

		MfgReturn mfgReturnRes = null;
		Info info = new Info();
		try {
			mfgReturnRes = mfgReturnRepository.saveAndFlush(mfgReturn);

			if (mfgReturnRes != null) {
				info.setError(false);
				info.setMessage("MfgReturn Saved Successfully.");
			} else {
				info.setError(true);
				info.setMessage("MfgReturn Not Saved .");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("MfgReturn Not Saved .");
			e.printStackTrace();

		}
		return info;

	}

	// --------------------------------------------------------------------------------------
	@RequestMapping(value = "/getAllRsHeader", method = RequestMethod.GET)
	public @ResponseBody List<RSHeader> getAllRsHeader() {

		List<RSHeader> rsHeaderList;
		try {
			rsHeaderList = rsHeaderRepository.findAllByIsUsed(0);
		} catch (Exception e) {
			rsHeaderList = new ArrayList<>();

			e.printStackTrace();

		}
		return rsHeaderList;
	}

	// --------------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------------
		@RequestMapping(value = "/getRsHeader", method = RequestMethod.POST)
		public @ResponseBody RSHeader getRsHeader(@RequestParam("rsHeaderId") int rsHeaderId) {

			RSHeader rsHeaderRes;
			try {
				rsHeaderRes = rsHeaderRepository.findByRsHeaderId(rsHeaderId);
			} catch (Exception e) {
				rsHeaderRes = new RSHeader();

				e.printStackTrace();

			}
			return rsHeaderRes;
		}

		// --------------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------------
		@RequestMapping(value = "/getAllRsDetails", method = RequestMethod.POST)
		public @ResponseBody List<RsDetail> getAllRsDetails(@RequestParam("rsHeaderId") int rsHeaderId) {

			List<RsDetail> rsDetailList;
			try {
				rsDetailList = rsDetailRepository.findAllByRsHeaderId(rsHeaderId);
				
			} catch (Exception e) {
				rsDetailList = new ArrayList<>();

				e.printStackTrace();

			}
			return rsDetailList;
		}

		// --------------------------------------------------------------------------------------
	// ----------------------------Insert Currency----------------------------
	@RequestMapping(value = { "/insertCurrency" }, method = RequestMethod.POST)
	public @ResponseBody Info insertCurrency(@RequestBody Currency currency) {

		Currency currencyRes = null;
		Info info = new Info();
		try {
			currencyRes = currencyRepository.saveAndFlush(currency);

			if (currencyRes != null) {
				info.setError(false);
				info.setMessage("Currency Insert Successfully.");
			} else {
				info.setError(true);
				info.setMessage("Currency not Insert.");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("Currency not Insert.");
			e.printStackTrace();

		}
		return info;

	}

	// ---------------------------All Currency---------------------------------
	@RequestMapping(value = "/getAllCurrency", method = RequestMethod.GET)
	public @ResponseBody List<Currency> getAllCurrency() {

		List<Currency> currencyList;
		try {
			currencyList = currencyRepository.findAllByIsUsed(0);
		} catch (Exception e) {
			currencyList = new ArrayList<>();

			e.printStackTrace();

		}
		return currencyList;
	}

	// --------------------------------------------------------------------------------------
	// ----------------------------Insert Bill Payment---------------------
	@RequestMapping(value = { "/insertBillPayment" }, method = RequestMethod.POST)
	public @ResponseBody Info insertBillPayment(@RequestBody List<BillPayment> billPaymentList) {

		List<BillPayment> billPaymentRes = null;
		Info info = new Info();
		try {
			billPaymentRes = billPaymentRepository.saveAll(billPaymentList);

			if (billPaymentRes != null) {
				info.setError(false);
				info.setMessage(" Bill Done Successfully.");
			} else {
				info.setError(true);
				info.setMessage("not done.");
			}

		} catch (Exception e) {

			info.setError(true);
			info.setMessage("not done.");
			e.printStackTrace();

		}
		return info;

	}

	// -------------------------------------------------------------------------
	// ------------------------Getting Bill by Id-----------------------
	@RequestMapping(value = { "/getAllBillPayemntById" }, method = RequestMethod.POST)
	public @ResponseBody BillPayment getAllBillPayemntById(@RequestParam("billId") int billId) {

		BillPayment billPayment = billPaymentRepository.findBillPaymentByBillId(billId);

		return billPayment;
	}
	
	
	@RequestMapping(value = { "/getCalVehicleKm" }, method = RequestMethod.POST)
	public @ResponseBody VehicleRes getCalVehicleKm(@RequestParam("vehId") int vehId) {

		VehicleRes vehicleRes = vehicleResRepository.findCalVehicleRes(vehId);

		return vehicleRes;
	}
	
	@RequestMapping(value = { "/findOutKm" }, method = RequestMethod.POST)
	public @ResponseBody VehicleRes findOutKm(@RequestParam("billTempId") int billTempId) {

		VehicleRes vehicleRes = vehicleResRepository.findOutKm(billTempId);

		return vehicleRes;
	}
	// ------------------------Update tvehicle inkm------------------------------------
		@RequestMapping(value = { "/updateTvehicleKm" }, method = RequestMethod.POST)
		public @ResponseBody Info updateTvehicleKm(@RequestParam int billTempId,@RequestParam int vehInKm) {

			int isUpdated = tVehicleRepository.updateInKms(billTempId,vehInKm);
			Info info = new Info();
			if (isUpdated == 1) {
				info.setError(false);
				info.setMessage("Vehicle Inkms Updated Successfully");
			} else {
				info.setError(true);
				info.setMessage("Vehicle Inkms Updated Failed");
			}
			return info;
		}

		// ------------------------------------------------------------------------
		@RequestMapping(value = { "/loginResponse" }, method = RequestMethod.POST)
		public @ResponseBody LoginResponse loginResponse(@RequestParam ("userName") String userName,@RequestParam ("pass") String pass)
		{
			 
			LoginResponse loginResponse = new LoginResponse();
			try {
				  
				User user = userRepository.findByUserNameAndPasswordAndIsUsed(userName,pass,0);
				if(user==null)
				{
					loginResponse.setError(true);
					loginResponse.setMsg("login Failed");
				}
				else
				{
					loginResponse.setError(false);
					loginResponse.setMsg("login successfully");
					loginResponse.setUser(user);
				}
				 
			} catch (Exception e) {

				e.printStackTrace();
				loginResponse.setError(true);
				loginResponse.setMsg("login Failed");
			}
	         
			return loginResponse; 
		}

}