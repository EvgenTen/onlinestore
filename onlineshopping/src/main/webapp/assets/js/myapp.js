$(function() {
	// Solving the active menu problem
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
	
	default:
		if(menu == "Home") break;
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;

	}

	// JQuery dataTAble
	//create DataSet
	var products = [
		['1', 'ABC'],
		['2', 'YUI'],
		['3', 'FGH'],
		['4', 'HKG'],
		['5', 'HUY'],
		['6', 'DHK'],
		['7', 'HLJ'],
		['8', 'FHJ'],
		['9', 'RTY'],
		
	];
	
	var $table = $('#productListTable');
	
	//execute the bellow code only where we have this table
	if($table.length) {
		//console.log('inside the table');
		
		$table.DataTable(  {
			
			lengthMenu:[[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'ALL']],
			pageLength: 5,
			data: products
		});
		
	}
	
	
	
	
	
});