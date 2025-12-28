.class public final LP1/b;
.super Lr2/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LP1/b;->b:I

    iput-object p2, p0, LP1/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final f0(I)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final Q(I)V
    .locals 1

    iget p1, p0, LP1/b;->b:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    iget-object v0, p0, LP1/b;->c:Ljava/lang/Object;

    check-cast v0, LS1/i;

    iput-boolean p1, v0, LS1/i;->d:Z

    iget-object p1, v0, LS1/i;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS1/h;

    if-eqz p1, :cond_0

    check-cast p1, LP1/f;

    invoke-virtual {p1}, LP1/f;->u()V

    invoke-virtual {p1}, LX1/g;->invalidateSelf()V

    :cond_0
    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final R(Landroid/graphics/Typeface;Z)V
    .locals 1

    iget p1, p0, LP1/b;->b:I

    packed-switch p1, :pswitch_data_0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iget-object p2, p0, LP1/b;->c:Ljava/lang/Object;

    check-cast p2, LS1/i;

    iput-boolean p1, p2, LS1/i;->d:Z

    iget-object p1, p2, LS1/i;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS1/h;

    if-eqz p1, :cond_1

    check-cast p1, LP1/f;

    invoke-virtual {p1}, LP1/f;->u()V

    invoke-virtual {p1}, LX1/g;->invalidateSelf()V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p0, LP1/b;->c:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/chip/Chip;

    iget-object p2, p1, Lcom/google/android/material/chip/Chip;->h:LP1/f;

    iget-boolean v0, p2, LP1/f;->F0:Z

    if-eqz v0, :cond_2

    iget-object p2, p2, LP1/f;->H:Ljava/lang/CharSequence;

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
