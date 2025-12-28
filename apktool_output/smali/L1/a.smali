.class public final LL1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LL1/a;->a:I

    iput-object p2, p0, LL1/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget p1, p0, LL1/a;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LL1/a;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/SearchView;

    iget-object p2, p1, Landroidx/appcompat/widget/SearchView;->A:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p3

    const/4 p4, 0x1

    if-le p3, p4, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    iget-object p4, p1, Landroidx/appcompat/widget/SearchView;->u:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    new-instance p5, Landroid/graphics/Rect;

    invoke-direct {p5}, Landroid/graphics/Rect;-><init>()V

    invoke-static {p1}, Lk/Y0;->a(Landroid/view/View;)Z

    move-result p6

    iget-boolean p7, p1, Landroidx/appcompat/widget/SearchView;->P:Z

    if-eqz p7, :cond_0

    const p7, 0x7f060029

    invoke-virtual {p3, p7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p7

    const p8, 0x7f06002a

    invoke-virtual {p3, p8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    add-int/2addr p3, p7

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iget-object p1, p1, Landroidx/appcompat/widget/SearchView;->s:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p7

    invoke-virtual {p7, p5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    if-eqz p6, :cond_1

    iget p6, p5, Landroid/graphics/Rect;->left:I

    neg-int p6, p6

    goto :goto_1

    :cond_1
    iget p6, p5, Landroid/graphics/Rect;->left:I

    add-int/2addr p6, p3

    sub-int p6, p4, p6

    :goto_1
    invoke-virtual {p1, p6}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p2

    iget p6, p5, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, p6

    iget p5, p5, Landroid/graphics/Rect;->right:I

    add-int/2addr p2, p5

    add-int/2addr p2, p3

    sub-int/2addr p2, p4

    invoke-virtual {p1, p2}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    :cond_2
    return-void

    :pswitch_0
    iget-object p1, p0, LL1/a;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
