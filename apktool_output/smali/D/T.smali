.class public final LD/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/O0;


# instance fields
.field public final a:Lc2/k;


# direct methods
.method public constructor <init>(Lo2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LZ/b;->C(Lo2/a;)Lc2/k;

    move-result-object p1

    iput-object p1, p0, LD/T;->a:Lc2/k;

    return-void
.end method


# virtual methods
.method public final a(LD/j0;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LD/T;->a:Lc2/k;

    invoke-virtual {p1}, Lc2/k;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
