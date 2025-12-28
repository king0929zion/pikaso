.class public final Lt0/i;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/l0;


# instance fields
.field public final synthetic q:Lp2/h;


# direct methods
.method public constructor <init>(Lo2/c;)V
    .locals 0

    check-cast p1, Lp2/h;

    iput-object p1, p0, Lt0/i;->q:Lp2/h;

    invoke-direct {p0}, LP/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Lt0/g;)V
    .locals 1

    iget-object v0, p0, Lt0/i;->q:Lp2/h;

    invoke-interface {v0, p1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
