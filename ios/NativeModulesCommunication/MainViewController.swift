//
//  MainViewController.swift
//  NativeModulesCommunication
//
//  Created by Fabrizio Duroni on 04.11.18.
//

import UIKit

class MainViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    @IBAction func showReactNativeModal(_ sender: Any) {
        present(ReactNativeModalViewController(), animated: true, completion: nil)
    }
}
