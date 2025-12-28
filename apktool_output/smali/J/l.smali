.class public final Lj/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic d:Lj/n;


# direct methods
.method public constructor <init>(Lj/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/l;->d:Lj/n;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, Lj/l;->d:Lj/n;

    invoke-virtual {v0}, Lj/n;->c()V

    return-void
.end method
