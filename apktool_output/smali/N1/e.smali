.class public final LN1/e;
.super Ld1/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, LN1/e;->d:I

    iput-object p1, p0, LN1/e;->e:Landroid/view/View;

    invoke-direct {p0}, Ld1/b;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget v0, p0, LN1/e;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ld1/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void

    :pswitch_0
    invoke-super {p0, p1, p2}, Ld1/b;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    iget-object p1, p0, LN1/e;->e:Landroid/view/View;

    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    iget-boolean p1, p1, Lcom/google/android/material/internal/CheckableImageButton;->g:Z

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;Le1/j;)V
    .locals 7

    const/4 v0, 0x1

    iget-object v1, p0, LN1/e;->e:Landroid/view/View;

    iget-object v2, p0, Ld1/b;->a:Landroid/view/View$AccessibilityDelegate;

    iget v3, p0, LN1/e;->d:I

    packed-switch v3, :pswitch_data_0

    iget-object p2, p2, Le1/j;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    check-cast v1, Lcom/google/android/material/internal/NavigationMenuItemView;

    iget-boolean p1, v1, Lcom/google/android/material/internal/NavigationMenuItemView;->A:Z

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    return-void

    :pswitch_0
    iget-object p2, p2, Le1/j;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    check-cast v1, Lcom/google/android/material/internal/CheckableImageButton;

    iget-boolean p1, v1, Lcom/google/android/material/internal/CheckableImageButton;->h:Z

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    iget-boolean p1, v1, Lcom/google/android/material/internal/CheckableImageButton;->g:Z

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    return-void

    :pswitch_1
    iget-object v3, p2, Le1/j;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v2, p1, v3}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sget v2, Lcom/google/android/material/button/MaterialButtonToggleGroup;->n:I

    check-cast v1, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, p1, Lcom/google/android/material/button/MaterialButton;

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    move v2, v3

    move v5, v2

    :goto_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-ge v2, v6, :cond_3

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    if-ne v6, p1, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    instance-of v6, v6, Lcom/google/android/material/button/MaterialButton;

    if-eqz v6, :cond_2

    invoke-virtual {v1, v2}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->c(I)Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/2addr v5, v0

    :cond_2
    add-int/2addr v2, v0

    goto :goto_0

    :cond_3
    :goto_1
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    iget-boolean p1, p1, Lcom/google/android/material/button/MaterialButton;->r:Z

    invoke-static {p1, v3, v0, v4, v0}, Le1/i;->a(ZIIII)Le1/i;

    move-result-object p1

    invoke-virtual {p2, p1}, Le1/j;->i(Le1/i;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
