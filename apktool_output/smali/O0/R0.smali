.class public final Lo0/R0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:LD/v0;


# direct methods
.method public constructor <init>(Landroid/view/View;LD/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/R0;->d:Landroid/view/View;

    iput-object p2, p0, Lo0/R0;->e:LD/v0;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lo0/R0;->d:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lo0/R0;->e:LD/v0;

    invoke-virtual {p1}, LD/v0;->d()V

    return-void
.end method
