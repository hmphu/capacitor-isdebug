import Foundation

@objc public class IsDebug: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
