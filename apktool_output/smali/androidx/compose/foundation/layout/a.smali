.class public final Landroidx/compose/foundation/layout/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/foundation/layout/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/a;->a:Landroidx/compose/foundation/layout/a;

    return-void
.end method


# virtual methods
.method public final a(LP/l;)LP/l;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/BoxChildDataElement;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, LP/l;->c(LP/l;)LP/l;

    move-result-object p1

    return-object p1
.end method
