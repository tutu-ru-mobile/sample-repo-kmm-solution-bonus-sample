import sample_di_swift
import ios_kotlin_pod
import lib_basic_swift
import Foundation

public class GlobalViewModel: ObservableObject {
    @Published public var myState: Sample_diSampleDi.GlobalState

    public init(di:Sample_diSampleDi) {
        myState = di.getLastState()
        di.addListener(listener: {state in
            self.myState = state
        })
    }

}
