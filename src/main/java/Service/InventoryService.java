package Service;

import Entity.Inventory;
import Payload.ApiResponse;
import Payload.InventoryRequest;

public interface InventoryService {

    public ApiResponse addInventory(InventoryRequest inventoryRequest);
    public ApiResponse deleteInventory(Long inventoryId);
    public ApiResponse updateInventory(Long id,InventoryRequest inventoryRequest);
    public Inventory getInventory(Long id);
}
