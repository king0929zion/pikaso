.class public final LG1/j;
.super Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LG1/j;->a:I

    invoke-direct {p0}, Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancelled(Landroid/accessibilityservice/GestureDescription;)V
    .locals 1

    iget v0, p0, LG1/j;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;->onCancelled(Landroid/accessibilityservice/GestureDescription;)V

    const-string p1, "UIAccessibilityService"

    const-string v0, "\u957f\u6309\u624b\u52bf\u88ab\u53d6\u6d88\u3002"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :pswitch_0
    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;->onCancelled(Landroid/accessibilityservice/GestureDescription;)V

    const-string p1, "UIAccessibilityService"

    const-string v0, "\u624b\u52bf\u88ab\u53d6\u6d88\u3002"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCompleted(Landroid/accessibilityservice/GestureDescription;)V
    .locals 1

    iget v0, p0, LG1/j;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;->onCompleted(Landroid/accessibilityservice/GestureDescription;)V

    const-string p1, "UIAccessibilityService"

    const-string v0, "\u957f\u6309\u624b\u52bf\u5df2\u6210\u529f\u5b8c\u6210\u3002"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :pswitch_0
    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;->onCompleted(Landroid/accessibilityservice/GestureDescription;)V

    const-string p1, "UIAccessibilityService"

    const-string v0, "\u624b\u52bf\u5df2\u6210\u529f\u5b8c\u6210\u3002"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
