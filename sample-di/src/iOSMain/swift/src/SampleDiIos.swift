import SwiftUI
import Foundation
import solution_bonus_api_swift
import solution_bonus_impl_swift
import ios_kotlin_pod

public class SampleDiIos {
    public let common = Sample_diSampleDi()
    lazy public var solutionBonusIos = SolutionBonusIosImpl(
            common: common.solutionBonus
    )

    public init() {

    }
}
